/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_x_base_datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javie
 */
public class Clase_51_lista_datos extends Clase_49_conexion {

    public List<Clase_get_set_persona> lista() throws Exception {
        List<Clase_get_set_persona> lista = null;
        try {
            this.conexion_defecto();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM persona;");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Clase_get_set_persona per = new Clase_get_set_persona();
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("nombre"));
                per.setCodigo(rs.getString("persona_pkey"));
                lista.add(per);
            }
            rs.close();
            st.close();
            for (Clase_get_set_persona db : lista) {
                System.out.println(db.getNombre() + "-" + db.getCodigo());
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.conexion.close();
        }
        return lista;
    }
}
