package Item;

public class ItemMain {
	public static void main(String[] args) {

		Item it = new Item(10000, "Casa do Chapéu");
		System.out.println(it);
		
		Livro lv = new Livro(10000, "Casa do Chapéu");
		lv.setAutor("Alex");
		System.out.println(lv);
		
		Midia md = new Midia(10000, "Casa do Chapéu", "Herbert Richards", 120.5f);
		System.out.println(md);
		
		CD cd = new CD(10000, "Casa do Chapéu", "Herbert Richards", 120.5f);
		cd.setAlbum("Kaka");
		cd.setArtista("Pombew");
		cd.setFaixas(5);
		System.out.println(cd);
		
		VHS vhs = new VHS(10000, "Casa do Chapéu", "Herbert Richards", 120.5f);
		vhs.setTitulo("Amiguinhos");
		System.out.println(vhs);
		
	}
}
