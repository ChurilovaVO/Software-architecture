package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Interfaces.ITicketRepo;
import Models.BankAccount;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

import java.util.List;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {
    private long cardNumber;
    private boolean isAuthorized;
    private ICashRepo cashRepository;
    private ICarrierRepo carrierRepository;


    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy (Ticket ticket) throws RuntimeException{
        Carrier carrier = carrierRepository.read(1);
        return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization (User client){
        List<BankAccount> bankAccounts = CashRepository.getCashRepository().getClients();
        //проверяем, есть ли карта клиента в списке банковских аккаунтов
        for (BankAccount ba:bankAccounts) {
            if (ba.getCard() != client.getCardNumber()) {
                bankAccounts.add(new BankAccount());
            }
            this.isAuthorized=true;
        }
    }

}
