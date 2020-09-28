public class pakbejo2class {
    double luastanah, luastanahfinal ,panjang, lebar, isia, isib, isic, hargaa, hargab, hargac,
           ukurankeramik,ukurankeramika, ukurankeramikb, ukurankeramikc,
           totalharga, totalhargakeramika, totalhargakeramikb, totalhargakeramikc
           ;

//CONSTRUCTOR
pakbejo2class (double a, double b, double c,
               double d, double e, double f,
               double g, double h, double i)

// a = 30, b = 40, c =  100, d = 10 , e = 5 , f = 8, g = 54.000, h = 65.000, i = 60.000
{
    panjang = a ;
    lebar = b ;
    luastanah = c;
    isia = d; // isi box a
    isib = e; // isi box b
    isic = f;// isi box c
    hargaa = g ; //harga box a 54.000
    hargab = h; //harga box b 65.000
    hargac = i; //harga box c 60.000
}

//METHOD

//Method 1 : Convert Luas Tanah ke Centimeter Persegi
double luastanahfinal (){
    luastanahfinal = luastanah*luastanah*luastanah;
    return luastanahfinal;
}

//Method 2 : Ukuran Keramik
double ukurankeramik (){
    ukurankeramika = panjang*panjang;
    
    ukurankeramikb = lebar*lebar;
    
    ukurankeramikc = panjang*lebar;
    return ukurankeramik;
    
}


  
//Method 3 : Total Harga Keramik
double totalharga ()
{ 
    totalhargakeramika = luastanahfinal/ukurankeramika/isia*hargaa;
    
    totalhargakeramikb = luastanahfinal/ukurankeramikb/isib*hargab;
    totalhargakeramikc = luastanahfinal/ukurankeramikc/isic*hargac;
    
    //print
    System.out.println("Total Harga Keramik A: " + totalhargakeramika);
    System.out.println("Total Harga Keramik B: " + totalhargakeramikb);
    System.out.println("Total Harga Keramik C: " + totalhargakeramikc);
    return totalharga;
}

}