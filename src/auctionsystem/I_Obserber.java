/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionsystem;

/**
 *
 * @author emad
 */
public interface I_Obserber {
    public boolean Update();
    public boolean Attach(Sys Sys);
}
