package co.edu.umanizales.manage_store.controller.dto;

import co.edu.umanizales.manage_store.model.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class VendedorxCantDTO {
    private Seller seller;
    private int sales;
}
