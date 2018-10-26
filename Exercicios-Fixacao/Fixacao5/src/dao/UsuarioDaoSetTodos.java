package dao;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import model.Usuario;

public class UsuarioDaoSetTodos {
	private static UsuarioDaoSetTodos instance;
    private Set<Usuario> usuariosHashSet;
    private Set<Usuario> usuariosLinkedHashSet;
    private Set<Usuario> usuariosTreeSet;


    private UsuarioDaoSetTodos() {
    	usuariosHashSet = new HashSet<>();
        usuariosLinkedHashSet = new LinkedHashSet<>();
        usuariosTreeSet = new TreeSet<>();
    }

    public static UsuarioDaoSetTodos getInstance(){
        if(instance == null){
            instance = new UsuarioDaoSetTodos();
        }
        return instance;
    }

    public int getSize(){
        return usuariosHashSet.size();
    }

    public boolean insert(Usuario user){
        return usuariosHashSet.add(user) && usuariosLinkedHashSet.add(user) && usuariosTreeSet.add(user);
        
    }

    public String getTodos(){
        Iterator<Usuario> iterator;
        StringBuilder sb = new StringBuilder();
        sb.append("HashSet\n");
        iterator = usuariosHashSet.iterator();
        while(iterator.hasNext()){
            sb.append(iterator.next().toString());
            sb.append("\n");
        }
        sb.append("\nLinkedHashSet\n");
        iterator = usuariosLinkedHashSet.iterator();
        while(iterator.hasNext()){
            sb.append(iterator.next().toString());
            sb.append("\n");
        }
        sb.append("\nTreeSet\n");
        iterator = usuariosTreeSet.iterator();
        while (iterator.hasNext()){
            sb.append(iterator.next().toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
