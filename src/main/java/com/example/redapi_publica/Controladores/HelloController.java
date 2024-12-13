package com.example.redapi_publica.Controladores;

import com.example.redapi_publica.Clases.Superhero;
import com.example.redapi_publica.Clases.SuperheroResponse;
import com.example.redapi_publica.Conexiones.ConexionRetrofit;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class HelloController {

    @FXML
    private TextField textoBuscar;
    @FXML
    private TableColumn<Superhero, String> clRaza;
    @FXML
    private TableView<Superhero> tablaDatos;
    @FXML
    private TableColumn<Superhero, String> clGenero;
    @FXML
    private TableColumn<Superhero, String> clNombre;
    @FXML
    private TableColumn<Superhero, String> clPowerStats;
    @FXML
    private Button btnBuscar;

    private final SuperheroAPI superheroApi;

    public HelloController() {
        superheroApi = ConexionRetrofit.getRetrofitInstance().create(SuperheroAPI.class);
    }

    @FXML
    private void initialize() {
        // Configurar columnas de la tabla
        clNombre.setCellValueFactory(new PropertyValueFactory<>("name"));
        clPowerStats.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(
                String.format("Int: %s, Str: %s, Spd: %s",
                        data.getValue().getPowerstats().getIntelligence(),
                        data.getValue().getPowerstats().getStrength(),
                        data.getValue().getPowerstats().getSpeed())
        ));
        clGenero.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(
                data.getValue().getAppearance().getGender()
        ));
        clRaza.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(
                data.getValue().getAppearance().getRace()
        ));

        // Evento al presionar el botón
        btnBuscar.setOnAction(event -> searchSuperhero());
    }

    private void searchSuperhero() {
        String name = textoBuscar.getText().trim();
        System.out.println(name);
        if (!name.isEmpty()) {
            superheroApi.buscarSuperheroe(name).enqueue(new Callback<SuperheroResponse>() {
                @Override
                public void onResponse(Call<SuperheroResponse> call, Response<SuperheroResponse> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        List<Superhero> resultados = response.body().getResultados();
                        if (resultados != null && !resultados.isEmpty()) {
                            tablaDatos.getItems().setAll(resultados); // Actualizar la tabla con los resultados
                        } else {
                            mostrarAlerta("Sin resultados", "No se encontraron superhéroes con ese nombre.");
                        }
                    } else {
                        mostrarAlerta("Sin resultados", "No se encontraron superhéroes con ese nombre.");
                    }
                }

                @Override
                public void onFailure(Call<SuperheroResponse> call, Throwable t) {
                    t.printStackTrace();
                    mostrarAlerta("Error", "No se pudo conectar con la API. Intenta más tarde.");
                }
            });
        } else {
            mostrarAlerta("Campo vacío", "Por favor, introduce un nombre de superhéroe.");
        }
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
