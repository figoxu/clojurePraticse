(ns leinprj.core)
(require '[clojurewerkz.money.amounts :as ma])
(require '[clojurewerkz.money.currencies :as mc])

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn tryMoney
  "金额相关的联系"
  []
  (def two (ma/amount-of mc/USD 2))
  (ma/total [two two two two])
  )
