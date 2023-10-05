package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;
import java.util.ArrayList;
import java.util.HashMap;

public class Banco {
    private HashMap<String, ArrayList<Prestamo>> prestamos;
    private ArrayList<Cliente> clientes;

    public Banco() {
        prestamos = new HashMap<>();
        clientes = new ArrayList<>();
    }

    public HashMap<String, ArrayList<Prestamo>> getPrestamos() {
        return prestamos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    public void registrarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getCedula()) != null) {
        	System.out.println("Cliente ya existe :"+cliente.getCedula());  
        }else {
        clientes.add(cliente);
        System.out.println("Cliente registrado "); 
    }
    }
  
        public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {
            Cliente cliente = buscarCliente(cedulaCliente);
            if (cliente == null) {
              System.out.println("El cliente no es cliente del banco");
            }else {
            ArrayList<Prestamo> prestamosCliente = prestamos.getOrDefault(cedulaCliente, new ArrayList<>());
            prestamosCliente.add(prestamo);
            prestamos.put(cedulaCliente, prestamosCliente);
           
        }
        }
        public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {
       
            return prestamos.getOrDefault(cedulaCliente, null);
        
        }
    	
    	
}
