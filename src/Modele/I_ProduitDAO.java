package Modele;

import Metier.I_Catalogue;
import Metier.I_Produit;

import java.sql.SQLException;
import java.util.List;

public interface I_ProduitDAO {

    boolean addProduit(I_Produit produit , I_Catalogue catalogue) throws ClassNotFoundException;

    boolean updateProduit(I_Produit produit, I_Catalogue catalogue) throws SQLException, ClassNotFoundException;

    boolean deleteProduit(I_Produit produit, I_Catalogue catalogue) throws SQLException, ClassNotFoundException;

    List<I_Produit> getListeProduits() throws ClassNotFoundException;

    I_Produit getUnProduit(String nom) throws SQLException, ClassNotFoundException;
}
