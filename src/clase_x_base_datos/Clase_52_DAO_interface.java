/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_x_base_datos;

import java.util.List;

/**
 *
 * @author javie
 */
public interface Clase_52_DAO_interface {
    public void insertar(Clase_get_set_persona db51) throws Exception;
    public void modificar(Clase_get_set_persona db51) throws Exception;
    public void borrar(Clase_get_set_persona db51) throws Exception;
    public List<Clase_get_set_persona> listar() throws Exception;
}
