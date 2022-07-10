import { NgModule } from "@angular/core";
import { ButtonModule } from "primeng/button";
import { InputTextModule } from "primeng/inputtext";
import { DespesaRoute } from "../routes/despesa.routes";
import { DespesaComponent } from "../components/despesa.component";

@NgModule({
  declarations: [DespesaComponent],
  imports: [
    DespesaRoute,
    ButtonModule,
    InputTextModule
  ]
})
export class DespesaModule { }
