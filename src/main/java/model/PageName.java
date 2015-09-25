package model;

public enum PageName {

	HOME("home"), SHOW_ALL("showPersons"), NEW_PERSON("newPerson");

	private String nom;

	PageName(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

}
