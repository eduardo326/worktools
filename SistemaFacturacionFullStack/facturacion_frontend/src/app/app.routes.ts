import { Routes } from '@angular/router';
import { HomeComponent } from './components/pages/home/home.component';
import { ClientesComponent } from './components/pages/clientes/clientes.component';
import { FormComponent } from './components/pages/clientes/form/form.component';
import { DetalleComponent } from './components/pages/clientes/detalle/detalle.component';
import { LoginComponent } from './components/pages/usuarios/login.component';
import { AuthGuard } from './components/pages/usuarios/guards/auth.guard';
import { RoleGuard } from './components/pages/usuarios/guards/role.guard';
import { DetalleFacturaComponent } from './components/pages/facturas/detalle-factura.component';
import { FacturasComponent } from './components/pages/facturas/facturas.component';

export const ROUTES: Routes = [
	{ path: 'home', component: HomeComponent },
	{ path: 'clientes', component: ClientesComponent },
	{ path: 'clientes/page/:page', component: ClientesComponent },
	{path: 'clientes/form', component: FormComponent, canActivate: [AuthGuard, RoleGuard], data: { role: 'ROLE_ADMIN' }  },
	{path: 'clientes/form/:id', component: FormComponent, canActivate: [AuthGuard, RoleGuard], data: { role: 'ROLE_ADMIN' } },
	{path: 'login', component: LoginComponent},
	// {path: 'clientes/detalle/:id', component: DetalleComponent},
	{ path: 'facturas/:id', component: DetalleFacturaComponent, canActivate: [AuthGuard, RoleGuard], data: { role: 'ROLE_USER' } },
	{ path: 'facturas/form/:clienteId', component: FacturasComponent, canActivate: [AuthGuard, RoleGuard], data: { role: 'ROLE_ADMIN' }},
	{ path: '**', pathMatch:'full', redirectTo:'home' }
] 