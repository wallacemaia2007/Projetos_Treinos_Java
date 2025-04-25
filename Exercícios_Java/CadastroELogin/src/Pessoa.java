public class Pessoa {

    //ATRIBUTOS

    private String usuario;
    private String senha;
    private String loginUsuario;
    private String loginSenha;

    //MÉTODOS ACESSORES

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return usuario;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }

    public void setLoginSenha(String loginSenha){
        this.loginSenha = loginSenha;
    }
    public String getLoginSenha(){
        return senha;
    }

    public void setLoginUsuario(String loginUsuario){
        this.loginUsuario = loginUsuario;
    }
    public String getLoginUsuario(){
        return loginUsuario;
    }

    //Comparar as respostas e verificar se está corretas

    public boolean compararLogin(){
        boolean resLogin = usuario.equals(loginUsuario);
        return resLogin;
    }
    public boolean compararSenha(){
        boolean resSenha = senha.equals(loginSenha);
        return resSenha;
    }

    
}
