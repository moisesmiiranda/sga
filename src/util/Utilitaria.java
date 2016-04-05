/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

/**
 *
 * @author moises
 */
public class Utilitaria {
    
 private static Session sessao;   
 private static Configuration configuracao;
 
public static void configurar(){
    configuracao = new Configuration();
    configuracao.addAnnotatedClass(modelo.Paciente.class);
    configuracao.addAnnotatedClass(modelo.Consulta.class);
    configuracao.addAnnotatedClass(modelo.Profissional.class);
    
    SchemaUpdate update = new SchemaUpdate(configuracao);
    update.execute(true, true);
}

public static Session getSession(){
    ServiceRegistry service = new StandardServiceRegistryBuilder().build();
    sessao = configuracao.buildSessionFactory(service).openSession();
    return sessao;
}
}
