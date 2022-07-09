import { RouterModule, Routes } from "@angular/router";
import { ModuleWithProviders } from "@angular/core";
import { CategoriaComponent } from "../components/categoria.component";

export const routes: Routes = [{ path: 'categoria', component: CategoriaComponent }];

export const CategoriaRoute: ModuleWithProviders<any> = RouterModule.forRoot(routes);
