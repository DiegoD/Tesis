package com.vista;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/*TEST SUBVERSION*/
public class MonedaView extends Panel implements View{
	VerticalLayout layout = new VerticalLayout();

    final TextField codMoneda = new TextField();
    final TextField simboloMoneda = new TextField();
    final TextField nomMoneda = new TextField();
    final Button btnIngresar = new Button("Ingresar");
	
	public MonedaView()
    {
        this.codMoneda.setCaption("Codigo");
         this.simboloMoneda.setCaption("Simbolo");
         this.nomMoneda.setCaption("Nombre");
         
         this.btnIngresar.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                
                String result = "OK";
                
               
                  layout.addComponent(new Label(result));
            }
        });
         
        layout.addComponents(codMoneda, simboloMoneda, nomMoneda, btnIngresar);
        layout.setMargin(true);
        layout.setSpacing(true);
        layout.setSizeFull();
        
        setContent(layout);
    }
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}
