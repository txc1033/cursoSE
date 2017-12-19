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
public class Clase_52_DAO_impl extends Clase_52_DAO_conexion implements Clase_52_DAO_interface {

    @Override
    public void insertar(Clase_get_set_persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO persona (nombre, persona_pkey) VALUES (?,?);");
            st.setString(1, per.getNombre());
            st.setString(2, per.getCodigo());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void modificar(Clase_get_set_persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE persona set nombre = ? WHERE id = ?;");
            st.setString(1, per.getNombre());
            st.setInt(2, per.getId());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void borrar(Clase_get_set_persona per) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM persona WHERE id = ?;");
            st.setInt(1, per.getId());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<Clase_get_set_persona> listar() throws Exception {
        List<Clase_get_set_persona> lista = null;
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM persona;");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Clase_get_set_persona p = new Clase_get_set_persona();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setCodigo(rs.getString("persona_pkey"));
                lista.add(p);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lista;
    }

}
