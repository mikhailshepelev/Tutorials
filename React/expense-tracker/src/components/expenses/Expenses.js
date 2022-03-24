import './Expenses.css';
import ExpenseItem from "./ExpenseItem";
import Card from '../ui/Card';
import ExpensesFilter from "./ExpensesFilter";
import React, { useState } from 'react';

function Expenses(props) {
    const [filteredYear, setFilteredYear] = useState('2021');

    const yearSelected = (year) => {
        setFilteredYear(year);
    }

    return (
        <div>
            <Card className="expenses">
                <ExpensesFilter selected={filteredYear} onYearChange={yearSelected}/>
                <ExpenseItem title={props.expenses[0].title}
                             amount={props.expenses[0].amount}
                             date={props.expenses[0].date}
                />
                <ExpenseItem title={props.expenses[1].title}
                             amount={props.expenses[1].amount}
                             date={props.expenses[1].date}
                />
                <ExpenseItem title={props.expenses[2].title}
                             amount={props.expenses[2].amount}
                             date={props.expenses[2].date}
                />
                <ExpenseItem title={props.expenses[3].title}
                             amount={props.expenses[3].amount}
                             date={props.expenses[3].date}
                />
            </Card>
        </div>

    );
}

export default Expenses;