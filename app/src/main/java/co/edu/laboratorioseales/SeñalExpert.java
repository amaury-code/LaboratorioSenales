package co.edu.laboratorioseales;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SeñalExpert extends AppCompatActivity {
    List<String> getType(String typeSignal) {
        List<String> listSignal = new ArrayList<>();

        if (typeSignal.equals("Señales Restrictivas")) {
            listSignal.add("Prohibido girar a la derecha");
            listSignal.add("Circulación prohibida de mascotas");
            listSignal.add("Prohibido dejar o Recoger Pasajeros");
        }
        else {
            if (typeSignal.equals("Señales Preventivas")) {
                listSignal.add("Curva Pronunciada");
                listSignal.add("Glorieta");
                listSignal.add("Doble Circulación");
            }
            else {
                if (typeSignal.equals("Señales Informativas")) {
                    listSignal.add("Primeros Auxilios");
                    listSignal.add("Hospedaje");
                    listSignal.add("Restaurante");
                }
                else {
                    listSignal.add("Alto o Stop");
                    listSignal.add("Velocidad máxima permitida");
                    listSignal.add("Altura máxima permitida");
                }
            }
        }
        return listSignal;
    }




}
