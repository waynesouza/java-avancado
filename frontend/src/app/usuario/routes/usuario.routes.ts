import { RouterModule, Routes } from "@angular/router";
import { ModuleWithProviders } from "@angular/core";
import { UsuarioComponent } from "../components/usuario.component";

export const routes: Routes = [{ path: 'usuario', component: UsuarioComponent }];

export const UsuarioRoute: ModuleWithProviders<any> = RouterModule.forRoot(routes);
