package POO_ev2;

public class videogame extends info
{
    public String prodvid_genero;
    public String prodvid_plataforma;


public videogame (String prod_genero_new, String prod_plataforma_new,String prod_nombre_new, int prod_costo_new, int prod_disponible_new, int prod_dias_new)
{
    super (prod_nombre_new, prod_costo_new,  prod_dias_new,  prod_disponible_new);
    prodvid_plataforma = prod_genero_new;
    prodvid_genero = prod_genero_new;
}


public String getprod_genero()
{
    return prodvid_genero;
}

public String getprod_plataforma()
{
    return prodvid_plataforma;
}





}



