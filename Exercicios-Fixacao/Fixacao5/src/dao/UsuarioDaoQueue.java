package dao;


import java.util.LinkedList;
import java.util.Queue;

import model.Usuario;

public class UsuarioDaoQueue {
	
    private static UsuarioDaoQueue instance;
    private Queue<Usuario> usuarios;

    private UsuarioDaoQueue() {
        usuarios = new LinkedList<>();
    }

    public static UsuarioDaoQueue getInstance(){
        if(instance == null){
            instance = new UsuarioDaoQueue();
        }
        return instance;
    }

    public int getSize(){
        return usuarios.size();
    }

    public void insert(Usuario user){
       usuarios.add(user);
    }

    public String getAll(){
        StringBuilder sb = new StringBuilder();
        while (!usuarios.isEmpty()){
            sb.append(usuarios.remove().toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
