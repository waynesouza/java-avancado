import { NgModule } from "@angular/core";
import { ButtonModule } from "primeng/button";
import { InputTextModule } from "primeng/inputtext";
import { PasswordModule } from "primeng/password";
import { UsuarioRoute } from "../routes/usuario.routes";
import { UsuarioComponent } from "../components/usuario.component";

@NgModule({
  declarations: [UsuarioComponent],
  imports: [
    UsuarioRoute,
    ButtonModule,
    InputTextModule,
    PasswordModule
  ]
})
export class UsuarioModule { }
