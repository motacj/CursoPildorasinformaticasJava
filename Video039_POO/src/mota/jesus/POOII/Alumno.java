package mota.jesus.POOII;

public class Alumno {
	
	/**
	 * Atrinutos
	 */
	
	private String nombreAlumno;
	
	private double notaMedia;
	
	private int IdAlumno;
	
	private static int siguienteIdAlumno = 1;

	/**
	 * Constructor de alumno que se le pasan dos parametros
	 * @param nombreAlumno
	 * @param d
	 */
	public Alumno(String nombreAlumno, double d) {
		
		this.nombreAlumno = nombreAlumno;
		
		this.notaMedia = d;
		
		this.IdAlumno = this.siguienteIdAlumno;
		
		this.siguienteIdAlumno++;
	}

	/**
	 * @return the nombreAlumno
	 */
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	/**
	 * @param nombreAlumno the nombreAlumno to set
	 */
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	/**
	 * @return the notaMedia
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	/**
	 * @return the idAlumno
	 */
	public int getIdAlumno() {
		return IdAlumno;
	}

	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(int idAlumno) {
		IdAlumno = idAlumno;
	}


	

	
}
