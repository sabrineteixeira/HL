public class Livro {

	private String id;
		private String titulo; 
		private String autor; 
		private int ano; 
		private int quanttotal;
		private int quantdisponivel;
		
		public Livro(String id, String titulo, String autor, int ano, int quanttotal, int quantdisponivel) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.autor = autor;
			this.ano = ano;
			this.quanttotal = quanttotal;
			this.quantdisponivel = quantdisponivel;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public int getQuanttotal() {
			return quanttotal;
		}

		public void setQuanttotal(int quanttotal) {
			this.quanttotal = quanttotal;
		}

		public int getQuantdisponivel() {
			return quantdisponivel;
		}

		public void setQuantdisponivel(int quantdisponivel) {
			this.quantdisponivel = quantdisponivel;
		}







}







