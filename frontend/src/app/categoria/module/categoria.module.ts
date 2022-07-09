import { NgModule } from "@angular/core";
import { ButtonModule } from "primeng/button";
import { InputTextModule } from "primeng/inputtext";
import { CategoriaComponent } from "../components/categoria.component";
import { CategoriaRoute } from "../routes/categoria.routes";

@NgModule({
  declarations: [CategoriaComponent],
  imports: [
    CategoriaRoute,
    ButtonModule,
    InputTextModule
  ]
})
export class CategoriaModule { }
