package dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.Usuario;

public class UsuarioDaoSet {
	private static UsuarioDaoSet instance;
    private Set<Usuario> usuarios;


    private UsuarioDaoSet() {
        usuarios = new HashSet<>();
    }

    public static UsuarioDaoSet getInstance(){
        if(instance == null){
            instance = new UsuarioDaoSet();
        }
        return instance;
    }

    public int getSize(){
        return usuarios.size();
    }

    public boolean insert(Usuario user){
        return usuarios.add(user);
    }

    public Set retornaTodos() {
    	return usuarios;
    }
    
    public Usuario recuperate(String username){
        Usuario usuario;
        Usuario retorno = null;
        Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext() && retorno == null){
            usuario = iterator.next();
            if(usuario.getUsername().equals(username)){
                retorno = usuario;
            }
        }
        return retorno;
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
