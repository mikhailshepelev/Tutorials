import './Expenses.css';
import Card from '../ui/Card';
import ExpensesFilter from "./ExpensesFilter";
import React, { useState } from 'react';
import ExpensesList from "./ExpensesList";
import ExpensesChart from "./ExpensesChart";

function Expenses(props) {
    const [filteredYear, setFilteredYear] = useState('2020');

    const yearSelected = (year) => {
        setFilteredYear(year);
        console.log(props.items[0].date.getFullYear());
        console.log(filteredYear);
    }

    const filteredItems = props.items.filter(expense => expense.date.getFullYear().toString() === filteredYear);

    return (
        <div>
            <Card className="expenses">
                <ExpensesFilter selected={filteredYear} onYearChange={yearSelected}/>
                <ExpensesChart expenses={filteredItems}/>
                <ExpensesList items={filteredItems}/>
            </Card>
        </div>

    );
}

export default Expenses;