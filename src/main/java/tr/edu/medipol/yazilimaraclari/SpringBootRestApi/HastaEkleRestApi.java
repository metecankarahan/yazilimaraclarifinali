package tr.edu.medipol.yazilimaraclari.SpringBootRestApi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/hastaekle")

public class HastaEkleRestApi {
	
	    public static List<String> hastaad = new ArrayList<>();

	    @GetMapping("/listele")
	    public static List<String> listele(){
	        return hastaad;
	    }

	    @PostMapping("/ekle")
	    public static String ekle(@RequestBody String ad) {
	    	hastaad.add(ad);
	        return ad;
	    } 

	    @PostMapping("/sil")
	    public static String sil(@RequestBody String ad) {
	    	hastaad.remove(ad);
	        return ad;
	        
	        
	    }


	}