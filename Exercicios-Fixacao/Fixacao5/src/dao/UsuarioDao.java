package dao;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import model.Usuario;

public class UsuarioDao {
	
    private static UsuarioDao instance;
    private List<Usuario> usuarios;


    private UsuarioDao() {
        usuarios = new LinkedList<>();
    }

    public static UsuarioDao getInstance(){
        if(instance == null){
            instance = new UsuarioDao();
        }
        return instance;
    }

    public int getSize(){
        return usuarios.size();
    }

    public boolean insert(Usuario user){
    	/*
        boolean deuCerto = false;
        boolean repetido = false;
        for(Usuario u : usuarios){
            if(user.equals(u)){
                repetido = true;
                break;
            }
        }
        if(!repetido) {
        	usuarios.add(user);
            Collections.sort(usuarios);
            deuCerto = true;
        }
        return deuCerto;
        */
        boolean deuCerto = false;
        if(!usuarios.contains(user)){
            usuarios.add(user);
            Collections.sort(usuarios);
            deuCerto = true;
        } 
        return deuCerto;
    }

    public Usuario recuperate(int positon){
        Usuario user = null;
        if(positon >= 0 && positon < usuarios.size()){
            user = usuarios.get(positon);
        }
        return user;
    }

    public int searchUsuarioPosition(String username){
        int position=-1;
        int i=0;
        for(Usuario u : usuarios){
            if(u.getUsername().equals(username)){
                position = i;
                break;
            }
            i++;
        }
        return position;
    }
}
