import { BrowserModule } from '@angular/platform-browser';
import { NgModule, LOCALE_ID } from '@angular/core';
import { RouterModule } from '@angular/router';
import { registerLocaleData } from '@angular/common';
import localeES from '@angular/common/locales/es';

import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

registerLocaleData(localeES, 'es');
// import rutas
import { ROUTES } from './app.routes';

import { MatDatepickerModule } from '@angular/material';
import { MatMomentDateModule } from '@angular/material-moment-adapter';
import { MatAutocompleteModule } from '@angular/material/autocomplete';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';

//Componentes
import { HomeComponent } from './components/pages/home/home.component';
import { HeaderComponent } from './components/layouts/header/header.component';
import { ClientesComponent } from './components/pages/clientes/clientes.component';
import { FormComponent } from './components/pages/clientes/form/form.component';
import { PaginatorComponent } from './components/layouts/paginator/paginator.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DetalleComponent } from './components/pages/clientes/detalle/detalle.component';
import { LoginComponent } from './components/pages/usuarios/login.component';
import { DetalleFacturaComponent } from './components/pages/facturas/detalle-factura.component';
import { FacturasComponent } from './components/pages/facturas/facturas.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    ClientesComponent,
    FormComponent,
    PaginatorComponent,
    DetalleComponent,
    LoginComponent,
    DetalleFacturaComponent,
    FacturasComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot( ROUTES, { useHash: true } ),
    BrowserAnimationsModule,
    MatDatepickerModule, 
    MatMomentDateModule,
    ReactiveFormsModule, MatAutocompleteModule, MatInputModule, MatFormFieldModule
  ],
  providers: [
    {provide: LOCALE_ID, useValue: 'es-CO' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
