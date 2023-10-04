package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;

public class PrimaryController{

    @FXML
    private ListView<Monstro> monsterListView;

        public List<Monstro> carregarMonstros() {
        try {
            var url = new URL("https://mhw-db.com/monsters");
            var con = url.openConnection();
            con.connect();
            try (var is = con.getInputStream();
                
                var reader = new BufferedReader(new InputStreamReader(is))) {

                var json = reader.readLine();
                return jsonParaList(json); // Call the jsonParaList method here
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    private List<Monstro> jsonParaList(String json) {
        var mapper = new ObjectMapper();
        try {
            var results = mapper.readTree(json);
            List<Monstro> monstros = new ArrayList<>();

            results.forEach(monstro -> {
                try {
                    var p = mapper.readValue(monstro.toString(), Monstro.class);
                    monstros.add(p);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            return monstros;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>(); 
    }
}
