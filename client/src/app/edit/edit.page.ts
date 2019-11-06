import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UsuarioService } from '../services/usuario.service';
import { IUsuario } from '../interfaces/IUsuario';
@Component({
  selector: 'app-edit',
  templateUrl: './edit.page.html',
  styleUrls: ['./edit.page.scss'],
})
export class EditPage implements OnInit {

  param;
  usuario:IUsuario = new IUsuario();
  constructor(
    private route:Router,
    private activeRoute: ActivatedRoute,
    private usuarioService:UsuarioService) { }

  ngOnInit() {
    this.param = this.activeRoute.snapshot.paramMap.get('id');
    console.log("IDSDAS", this.param);
    this.usuarioService.findId(this.param).subscribe(resp=>{
      this.usuario = resp;
    })
  }

  update(){
    this.usuarioService.update(this.usuario).subscribe(resp=>{
      this.usuario = resp;
      this.route.navigate(['home']);
    });
  }

}
