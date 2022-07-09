import { NgModule } from "@angular/core";
import { LoginComponent } from "../components/login.component";
import { InputTextModule } from "primeng/inputtext";
import {LoginRoute} from "../routes/login.routes";
import {PasswordModule} from "primeng/password";
import {ButtonModule} from "primeng/button";

@NgModule({
  declarations: [LoginComponent],
  imports: [
    LoginRoute,
    ButtonModule,
    InputTextModule,
    PasswordModule
  ]
})
export class LoginModule { }
