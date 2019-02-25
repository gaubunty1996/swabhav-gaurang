import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { WelcomeComponent } from './welcome.component';
import { StudentComponent } from '../student/student.component';

@NgModule({
  declarations: [
    WelcomeComponent,
    StudentComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})
export class WelcomeModule { }