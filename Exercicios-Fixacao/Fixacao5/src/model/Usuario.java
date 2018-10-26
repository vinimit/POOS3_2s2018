package model;

import java.security.MessageDigest;

public class Usuario implements Comparable<Usuario>{
	
	private String username;
    private String nome;
    private String senha;

    public Usuario(String username, String nome, String senha) {
        this.username = username;
        this.nome = nome;
        setSenha(senha);
    } 

    public boolean autenticar(String username, String senha){
        boolean validado = false;
        if(this.username.equals(username)){
            if(this.senha.equals(getMD5(senha))){
                validado = true;
            }
        }
        return validado;
    }

    private String getMD5(String input){
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest  md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();
            for(byte b : digest){
                sb.append(String.format("%02x", b & 0xff));
            }
        }catch (Exception e){
            sb = new StringBuilder();
        }
        return sb.toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = getMD5(senha);
    }

    public void setSenhaCript(String senhaCript){
        this.senha = senhaCript;
    }

    @Override
	public String toString() {
		
		return username + " | " + nome + " | " + senha + " | " + this.hashCode();
	}
    
    @Override
    public boolean equals(Object obj) {
        boolean iguais = false;
        if(obj != null && obj instanceof Usuario){
            iguais = this.username.equals(((Usuario) obj).getUsername());
        }
        return iguais;
    }

    @Override
    public int compareTo(Usuario o) {
        int retorno = 0;
        if(o != null){
            retorno = this.username.compareTo(o.getUsername());
        }
        return  retorno;
    }
    
    @Override
	public int hashCode() {
    	//return 1;
    	return username.hashCode();
	}
}
