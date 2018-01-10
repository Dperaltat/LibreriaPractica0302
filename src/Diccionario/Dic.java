
package Diccionario;

import java.util.HashMap;
import java.util.List;

public class Dic<K,E> 
{
    private HashMap<K, E> DiccionarioHash;
    private List<HashMap> DiccionarioList;

    public Dic(HashMap<K, E> DiccionarioHash, List<HashMap> DicccionarioList) {
        this.DiccionarioHash = DiccionarioHash;
        this.DiccionarioList = DicccionarioList;
    }

    public HashMap<K, E> getDiccionarioHash() {
        return DiccionarioHash;
    }
    public void setDiccionarioHash(HashMap<K, E> DiccionarioHash) {
        this.DiccionarioHash = DiccionarioHash;
    }
    public List<HashMap> getDiccionarioList() {
        return DiccionarioList;
    }
    public void setDiccionarioList(List<HashMap> DiccionarioList) {
        this.DiccionarioList = DiccionarioList;
    }
    
    public boolean agregarElemento(K clave, E valor)
    {
        return this.DiccionarioList.add(DiccionarioHash);
    }
    
    public E recuperarElemento(K clave)
    {
        return this.DiccionarioHash.get(clave);
    }
    
    /*public List<E> recuperarElementos()
    {
        return this.DiccionarioList.add(0, DiccionarioHash);
    }*/
    
    public boolean eliminarElemento(K clave)
    {
        return this.DiccionarioList.remove(this.DiccionarioHash);
    }
}
