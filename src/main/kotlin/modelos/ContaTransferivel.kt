package modelos

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (valor <= this.saldo) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


}