/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.examen2;

import pe.edu.upeu.examen2.gui.ControllerGame;
import pe.edu.upeu.examen2.gui.Inicio;
import pe.edu.upeu.examen2.gui.ModelGame;

/**
 *
 * @author HP
 */
public class Examen2 {

    public static void main(String[] args) {
        ModelGame model = new ModelGame();
        Inicio view = new Inicio();
        ControllerGame controlador = new ControllerGame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
