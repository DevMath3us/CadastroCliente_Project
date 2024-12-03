package br.com.cadastro;

public class Cliente {
		private String name;
	    private String email;
	    private String telefone;

	    public Cliente(String name, String email, String telefone) {
	        this.name = name;
	        this.email = email;
	        this.telefone = telefone;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    @Override
	    public String toString() {
	        return "Cliente [name=" + name + ", email=" + email + ", telefone=" + telefone + "]";

	}

}
