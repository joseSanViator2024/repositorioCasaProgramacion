package casatema7Uno.maquinaria;

public class Trenes {

	private Locomotoras loc;
	private Vagones vag1;
	private Vagones vag2;
	private Vagones vag3;
	private Vagones vag4;
	private Vagones vag5;
	
	
	public Trenes(Locomotoras loc, Vagones vag1, Vagones vag2, Vagones vag3, Vagones vag4, Vagones vag5) {
		super();
		this.loc = loc;
		this.vag1 = vag1;
		this.vag2 = vag2;
		this.vag3 = vag3;
		this.vag4 = vag4;
		this.vag5 = vag5;
	}


	public Trenes(Locomotoras loc, Vagones vag1, Vagones vag2, Vagones vag3, Vagones vag4) {
		super();
		this.loc = loc;
		this.vag1 = vag1;
		this.vag2 = vag2;
		this.vag3 = vag3;
		this.vag4 = vag4;
	}


	public Trenes(Locomotoras loc, Vagones vag1, Vagones vag2, Vagones vag3) {
		super();
		this.loc = loc;
		this.vag1 = vag1;
		this.vag2 = vag2;
		this.vag3 = vag3;
	}


	public Trenes(Locomotoras loc, Vagones vag1, Vagones vag2) {
		super();
		this.loc = loc;
		this.vag1 = vag1;
		this.vag2 = vag2;
	}


	public Trenes(Locomotoras loc, Vagones vag1) {
		super();
		this.loc = loc;
		this.vag1 = vag1;
	}


	public Trenes(Locomotoras loc) {
		super();
		this.loc = loc;
	}
	
	
	
}
