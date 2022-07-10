import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginModule } from "./login/module/login.module";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import {CategoriaModule} from "./categoria/module/categoria.module";
import { DespesaComponent } from './despesa/components/despesa.component';
import { UsuarioComponent } from './usuario/components/usuario.component';
import { UsuarioModule } from "./usuario/module/usuario.module";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    CategoriaModule,
    AppRoutingModule,
    LoginModule,
    UsuarioModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
