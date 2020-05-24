import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AuthComponent} from './auth/auth.component';
import {TreatmentRequestComponent} from './dermatologist/treatment-request/treatment-request.component';


const routes: Routes = [
  { path: '', component: AuthComponent, pathMatch: 'full' },
  { path: 'treatment', component: TreatmentRequestComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
