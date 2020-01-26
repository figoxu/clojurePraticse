(clojure.string/capitalize "this is a proper sentence.")
(clojure.string/upper-case "loud noises!")
(clojure.string/lower-case "COLUMN_HEADER_ONE")
(clojure.string/trim " \t Bacon ipsum dolor sit.\n ")

;使用require来引用包
(require '[clojure.string :as str])
(str/upper-case "loud noises!")


(clojure.string/triml "  Column Header\t")
(clojure.string/trimr "\t\t* Second-level bullet.   \n    ")

;使用str函数连接字符串
(str "John" " " "Doe")
(def first-name "John")
(def last-name "Doe")
(def age 42)
(str last-name "," first-name "-age:" age)

;高阶apply函数执行str
(apply str ["a" "b" "c"])

;seq将字符串作为字符序列
(seq "Hello , world!")
(map int "Hello, world!")
;字符串和字数转换
(int \h)
(int \H)

(def me {:first-name "Ryan",:favorite-language "Clojure"})
(str "My name is " (:first-name me)
 ", and I really like to program in " (:favorite-language me))



