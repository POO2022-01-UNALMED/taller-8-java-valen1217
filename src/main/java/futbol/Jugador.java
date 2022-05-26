package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre,int edad,String posicion, short goles, byte dorsal){
		super(nombre,edad,posicion);
		this.golesMarcados = goles;
		this.dorsal = dorsal;
	}
	
	public Jugador(){
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	
	public boolean jugarConLasManos() {
		boolean valor = false;
		if(this.getPosicion().equals("Portero")) {
			valor = true;
		}
		return valor;
	}
	
	public int compareTo(Futbolista futbolista) {
		return this.getEdad() - futbolista.getEdad();
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() +
				" tiene " + super.getEdad() + ", y juega de " +
				super.getPosicion() + " con el dorsal " + dorsal +
				". Ha marcado " + golesMarcados;
	}
	
}
