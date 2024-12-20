package br.com.itilh.bdpedidos.sistemapedidos.model;
import java.math.BigDecimal;
import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @SequenceGenerator(name = "produto_id_seq", sequenceName = "tb_produtos_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_seq")
    private BigInteger id;

    @Column(name = "tx_descricao")
    private String descricao;

    @Column(name = "nu_preco_unidade_atual")
    private BigDecimal precoUnidadeAtual;

    @Column(name = "tx_informacoes")
    private String informacoes;

    public Object getImagemProduto() {
        return this.imagemProduto;
    }

    public void setImagemProduto(Object imagemProduto) {
        throw new UnsupportedOperationException("Unimplemented method 'setImagemProduto'");
    }

    @Column(name = "product_img")
    private byte[] imagemProduto;
}
