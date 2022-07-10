import { RouterModule, Routes } from "@angular/router";
import { ModuleWithProviders } from "@angular/core";
import { DespesaComponent } from "../components/despesa.component";

export const routes: Routes = [{ path: 'despesa', component: DespesaComponent }];

export const DespesaRoute: ModuleWithProviders<any> = RouterModule.forRoot(routes);
