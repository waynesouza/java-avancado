import {RouterModule, Routes} from "@angular/router";
import { LoginComponent } from "../components/login.component";
import {ModuleWithProviders} from "@angular/core";

export const routes: Routes = [{ path: 'login', component: LoginComponent }];

export const LoginRoute: ModuleWithProviders<any> = RouterModule.forRoot(routes);
