package com.example.redapi_publica.Controladores;

import com.example.redapi_publica.Clases.Superhero;
import com.example.redapi_publica.Clases.SuperheroResponse;
import com.example.redapi_publica.Conexiones.ConexionRetrofit;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import retrofit2.Call;
import retrofit2.Callback;

import java.util.List;

public class HelloController {

    @FXML
    private TextField textoBuscar;
    @FXML
    private TableColumn clRaza;
    @FXML
    private TableView tablaDatos;
    @FXML
    private TableColumn clGenero;
    @FXML
    private TableColumn clNombre;
    @FXML
    private TableColumn clPowerStats;
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
        clPowerStats.setCellValueFactory(new PropertyValueFactory<>("power_stats"));
        clGenero.setCellValueFactory(data -> data.getValue().getApariencia().getGenero() == null ?
                null : new javafx.beans.property.SimpleStringProperty(data.getValue().getApareincia().getGenero()));
        clRaza.setCellValueFactory(data -> data.getValue().getApariencia().getRaza() == null ?
                null : new javafx.beans.property.SimpleStringProperty(data.getValue().getApariencia().getRaza()));

        // Evento al presionar el botón
        btnBuscar.setOnAction(event -> searchSuperhero());
    }

    private void searchSuperhero() {
        String name = textoBuscar.getText().trim();
        if (!name.isEmpty()) {
            superheroApi.buscarSuperheroe(name).enqueue(new Callback<SuperheroResponse>() {
                @Override
                public void onResponse(Call<SuperheroResponse> call, Response<SuperheroResponse> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        List<Superhero> resultados = response.body().getResultados();
                        tablaDatos.getItems().setAll(resultados); // Actualizar la tabla con los resultados
                    }
                }

                @Override
                public void onFailure(Call<SuperheroResponse> call, Throwable t) {
                    t.printStackTrace(); // Manejar errores
                }
            });
        }
    }
}
