package com.cia.desafio.cia.desafio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ComunaModel.
 */
@JsonIgnoreProperties
public class ComunaModel {
	

	/** The local nombre. */
	private String local_nombre;
	
	/** The comuna nombre. */
	private String comuna_nombre;
	
	/** The local direccion. */
	private String local_direccion;
	
	
	/** The local telefono. */
	private String local_telefono;
	
	/** The local lat. */
	private String local_lat;
	
	/** The local lng. */
	private String local_lng;
	
	
	
	
	
	
	/**
	 * Instantiates a new comuna model.
	 */
	public ComunaModel() {
		super();
	}
	
	/**
	 * Instantiates a new comuna model.
	 *
	 * @param fecha the fecha
	 * @param local_id the local id
	 * @param local_nombre the local nombre
	 * @param comuna_nombre the comuna nombre
	 * @param localidad_nombre the localidad nombre
	 * @param local_direccion the local direccion
	 * @param funcionamiento_hora_apertura the funcionamiento hora apertura
	 * @param funcionamiento_hora_cierre the funcionamiento hora cierre
	 * @param local_telefono the local telefono
	 * @param local_lat the local lat
	 * @param local_lng the local lng
	 * @param funcionamiento_dia the funcionamiento dia
	 * @param fk_region the fk region
	 * @param fk_comuna the fk comuna
	 */
	public ComunaModel(String fecha, String local_id, String local_nombre, String comuna_nombre,
			String localidad_nombre, String local_direccion, String funcionamiento_hora_apertura,
			String funcionamiento_hora_cierre, String local_telefono, String local_lat, String local_lng,
			String funcionamiento_dia, String fk_region, String fk_comuna) {
		super();
	
		this.local_nombre = local_nombre;
		this.comuna_nombre = comuna_nombre;
	
		this.local_direccion = local_direccion;
	
	
		this.local_telefono = local_telefono;
		this.local_lat = local_lat;
		this.local_lng = local_lng;
	
	
	
	}
	
	/**
	 * Gets the local nombre.
	 *
	 * @return the local nombre
	 */
	public String getLocal_nombre() {
		return local_nombre;
	}
	
	/**
	 * Sets the local nombre.
	 *
	 * @param local_nombre the new local nombre
	 */
	public void setLocal_nombre(String local_nombre) {
		this.local_nombre = local_nombre;
	}
	
	/**
	 * Gets the comuna nombre.
	 *
	 * @return the comuna nombre
	 */
	public String getComuna_nombre() {
		return comuna_nombre;
	}
	
	/**
	 * Sets the comuna nombre.
	 *
	 * @param comuna_nombre the new comuna nombre
	 */
	public void setComuna_nombre(String comuna_nombre) {
		this.comuna_nombre = comuna_nombre;
	}
	
	/**
	 * Gets the local direccion.
	 *
	 * @return the local direccion
	 */
	public String getLocal_direccion() {
		return local_direccion;
	}
	
	/**
	 * Sets the local direccion.
	 *
	 * @param local_direccion the new local direccion
	 */
	public void setLocal_direccion(String local_direccion) {
		this.local_direccion = local_direccion;
	}
	
	/**
	 * Gets the local telefono.
	 *
	 * @return the local telefono
	 */
	public String getLocal_telefono() {
		return local_telefono;
	}
	
	/**
	 * Sets the local telefono.
	 *
	 * @param local_telefono the new local telefono
	 */
	public void setLocal_telefono(String local_telefono) {
		this.local_telefono = local_telefono;
	}
	
	/**
	 * Gets the local lat.
	 *
	 * @return the local lat
	 */
	public String getLocal_lat() {
		return local_lat;
	}
	
	/**
	 * Sets the local lat.
	 *
	 * @param local_lat the new local lat
	 */
	public void setLocal_lat(String local_lat) {
		this.local_lat = local_lat;
	}
	
	/**
	 * Gets the local lng.
	 *
	 * @return the local lng
	 */
	public String getLocal_lng() {
		return local_lng;
	}
	
	/**
	 * Sets the local lng.
	 *
	 * @param local_lng the new local lng
	 */
	public void setLocal_lng(String local_lng) {
		this.local_lng = local_lng;
	}
	
	
	
	

}
