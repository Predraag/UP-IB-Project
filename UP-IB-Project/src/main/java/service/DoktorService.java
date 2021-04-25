package service;

import java.util.List;

import model.Korisnik;
import model.Pregled;

public interface DoktorService {
	
	List<Korisnik> findAll();
	
	Pregled save(Pregled pregled);
	
	Pregled update(Pregled pregled);
}
