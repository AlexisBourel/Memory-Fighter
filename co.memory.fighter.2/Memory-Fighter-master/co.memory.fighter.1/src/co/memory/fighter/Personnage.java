package co.memory.fighter;

public class Personnage {

    

	private String nom;
    private int pv;
    private int typeAttack;
	private int typeParrade;



    public Personnage(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
    }

    public  void SePresenter(){
        System.out.println("je suis "+ this.getNom()+" j'ai: "+ this.getPv()+" pv");
    }

    



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }
    
    public int getTypeAttack() {
		return typeAttack;
	}

	public void setTypeAttack(int typeAttack) {
		this.typeAttack = typeAttack;
	}

	public int getTypeParrade() {
		return typeParrade;
	}

	public void setTypeParrade(int typeParrade) {
		this.typeParrade = typeParrade;
	}

	@Override
	public String toString() {
		return  nom + " : pv=" + pv;
	}
	

}
